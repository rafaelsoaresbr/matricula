import { ViewConfig } from '@vaadin/hilla-file-router/types.js';
import { AutoCrud } from '@vaadin/hilla-react-crud';
import { ResponsavelEndpoint } from 'Frontend/generated/endpoints';
import ResponsavelModel from 'Frontend/generated/io/dedyn/rafaelsoaresbr/data/ResponsavelModel';

export const config: ViewConfig = {
	menu: { order: 2, icon: 'line-awesome/svg/male-solid.svg' },
	title: 'Responsaveis',
	rolesAllowed: ['ADMIN'],
};

export default function ResponsaveisView() {
	ResponsavelEndpoint
	return (

		<div className="flex flex-col v-full items-center justify-center p-l text-center box-border">

			<AutoCrud service={ResponsavelEndpoint} model={ResponsavelModel} />

		</div>

	);
}
