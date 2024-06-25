import { ViewConfig } from '@vaadin/hilla-file-router/types.js';
import { AutoGrid } from '@vaadin/hilla-react-crud';
import { Button } from '@vaadin/react-components';
import { HorizontalLayout } from '@vaadin/react-components/HorizontalLayout.js';
import { AlunoEndpoint } from 'Frontend/generated/endpoints';
import AlunoModel from 'Frontend/generated/io/dedyn/rafaelsoaresbr/data/AlunoModel';

export const config: ViewConfig = {
	menu: { order: 1, icon: 'line-awesome/svg/people-carry-solid.svg' },
	title: 'Alunos',
	rolesAllowed: ['ADMIN'],
};

export default function AlunosView() {
	return (

		<div className="flex flex-col h-full items-center justify-center p-l text-center box-border">
			<HorizontalLayout theme="spacing" style={{ alignItems: 'left' }}>

				<Button aria-label="Cadastrar">Cadastrar</Button>

			</HorizontalLayout>

			<AutoGrid service={AlunoEndpoint} model={AlunoModel} />

		</div>

	);
}
